package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_406 {
    private final Production38_406 production = new Production38_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}