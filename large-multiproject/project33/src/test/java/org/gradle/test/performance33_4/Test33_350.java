package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_350 {
    private final Production33_350 production = new Production33_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}