package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_234 {
    private final Production14_234 production = new Production14_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}