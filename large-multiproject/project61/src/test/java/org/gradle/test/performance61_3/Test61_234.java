package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_234 {
    private final Production61_234 production = new Production61_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}