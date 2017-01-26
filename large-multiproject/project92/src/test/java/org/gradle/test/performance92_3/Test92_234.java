package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_234 {
    private final Production92_234 production = new Production92_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}