package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_269 {
    private final Production11_269 production = new Production11_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}