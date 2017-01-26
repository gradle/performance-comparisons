package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_234 {
    private final Production79_234 production = new Production79_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}