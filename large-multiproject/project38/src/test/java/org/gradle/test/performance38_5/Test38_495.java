package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_495 {
    private final Production38_495 production = new Production38_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}