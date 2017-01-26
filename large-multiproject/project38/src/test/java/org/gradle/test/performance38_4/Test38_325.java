package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_325 {
    private final Production38_325 production = new Production38_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}