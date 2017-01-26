package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_293 {
    private final Production38_293 production = new Production38_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}