package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_419 {
    private final Production33_419 production = new Production33_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}