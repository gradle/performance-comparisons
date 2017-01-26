package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_406 {
    private final Production62_406 production = new Production62_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}