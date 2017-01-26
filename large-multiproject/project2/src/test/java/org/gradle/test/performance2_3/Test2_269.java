package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_269 {
    private final Production2_269 production = new Production2_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}