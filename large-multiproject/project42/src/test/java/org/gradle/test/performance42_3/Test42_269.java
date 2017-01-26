package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_269 {
    private final Production42_269 production = new Production42_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}