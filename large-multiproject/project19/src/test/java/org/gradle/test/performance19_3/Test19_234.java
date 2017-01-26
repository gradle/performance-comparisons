package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_234 {
    private final Production19_234 production = new Production19_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}