package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_471 {
    private final Production33_471 production = new Production33_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}