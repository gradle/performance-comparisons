package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_437 {
    private final Production33_437 production = new Production33_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}