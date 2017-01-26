package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_255 {
    private final Production23_255 production = new Production23_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}