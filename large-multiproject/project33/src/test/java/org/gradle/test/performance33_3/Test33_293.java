package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_293 {
    private final Production33_293 production = new Production33_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}