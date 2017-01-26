package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_97 {
    private final Production23_97 production = new Production23_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}