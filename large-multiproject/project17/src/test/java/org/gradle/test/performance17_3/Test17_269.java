package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_269 {
    private final Production17_269 production = new Production17_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}