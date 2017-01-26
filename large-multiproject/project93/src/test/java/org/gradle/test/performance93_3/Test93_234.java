package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_234 {
    private final Production93_234 production = new Production93_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}