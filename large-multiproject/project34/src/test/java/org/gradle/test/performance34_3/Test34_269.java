package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_269 {
    private final Production34_269 production = new Production34_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}