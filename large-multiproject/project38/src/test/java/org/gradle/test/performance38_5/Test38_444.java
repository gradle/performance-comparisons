package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_444 {
    private final Production38_444 production = new Production38_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}