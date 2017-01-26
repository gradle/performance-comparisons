package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_356 {
    private final Production33_356 production = new Production33_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}