package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_49 {
    private final Production38_49 production = new Production38_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}