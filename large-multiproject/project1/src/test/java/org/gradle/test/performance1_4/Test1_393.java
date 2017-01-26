package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_393 {
    private final Production1_393 production = new Production1_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}