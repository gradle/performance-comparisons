package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_93 {
    private final Production23_93 production = new Production23_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}