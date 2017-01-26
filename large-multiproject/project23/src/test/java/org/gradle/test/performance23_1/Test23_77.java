package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_77 {
    private final Production23_77 production = new Production23_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}