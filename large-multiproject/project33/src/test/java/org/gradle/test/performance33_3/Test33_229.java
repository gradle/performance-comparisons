package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_229 {
    private final Production33_229 production = new Production33_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}