package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_77 {
    private final Production38_77 production = new Production38_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}