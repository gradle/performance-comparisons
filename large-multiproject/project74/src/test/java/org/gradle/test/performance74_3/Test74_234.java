package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_234 {
    private final Production74_234 production = new Production74_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}