package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_356 {
    private final Production38_356 production = new Production38_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}