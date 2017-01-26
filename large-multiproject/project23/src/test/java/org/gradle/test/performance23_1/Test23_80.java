package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_80 {
    private final Production23_80 production = new Production23_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}