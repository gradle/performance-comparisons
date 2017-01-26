package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_45 {
    private final Production34_45 production = new Production34_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}