package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_269 {
    private final Production23_269 production = new Production23_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}