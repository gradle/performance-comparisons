package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_77 {
    private final Production85_77 production = new Production85_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}