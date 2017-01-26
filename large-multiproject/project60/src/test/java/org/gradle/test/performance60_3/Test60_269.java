package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_269 {
    private final Production60_269 production = new Production60_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}