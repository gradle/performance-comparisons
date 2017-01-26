package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_382 {
    private final Production33_382 production = new Production33_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}