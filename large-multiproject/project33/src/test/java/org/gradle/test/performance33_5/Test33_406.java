package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_406 {
    private final Production33_406 production = new Production33_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}