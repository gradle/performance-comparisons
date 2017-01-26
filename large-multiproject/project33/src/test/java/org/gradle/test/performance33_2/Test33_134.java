package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_134 {
    private final Production33_134 production = new Production33_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}