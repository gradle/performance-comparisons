package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_465 {
    private final Production33_465 production = new Production33_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}