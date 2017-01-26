package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_77 {
    private final Production33_77 production = new Production33_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}