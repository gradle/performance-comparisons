package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_68 {
    private final Production23_68 production = new Production23_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}