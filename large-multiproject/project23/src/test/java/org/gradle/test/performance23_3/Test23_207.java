package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_207 {
    private final Production23_207 production = new Production23_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}