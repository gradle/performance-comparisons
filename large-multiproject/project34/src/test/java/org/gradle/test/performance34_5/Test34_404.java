package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_404 {
    private final Production34_404 production = new Production34_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}