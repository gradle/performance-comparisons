package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_234 {
    private final Production3_234 production = new Production3_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}