package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_107 {
    private final Production38_107 production = new Production38_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}