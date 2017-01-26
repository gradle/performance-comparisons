package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_183 {
    private final Production23_183 production = new Production23_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}