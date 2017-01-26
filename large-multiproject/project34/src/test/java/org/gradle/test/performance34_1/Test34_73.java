package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_73 {
    private final Production34_73 production = new Production34_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}