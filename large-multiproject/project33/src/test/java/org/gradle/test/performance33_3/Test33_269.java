package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_269 {
    private final Production33_269 production = new Production33_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}