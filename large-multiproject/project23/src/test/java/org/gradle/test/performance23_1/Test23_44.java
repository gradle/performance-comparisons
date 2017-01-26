package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_44 {
    private final Production23_44 production = new Production23_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}