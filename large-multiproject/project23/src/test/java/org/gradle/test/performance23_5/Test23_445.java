package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_445 {
    private final Production23_445 production = new Production23_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}