package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_76 {
    private final Production23_76 production = new Production23_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}