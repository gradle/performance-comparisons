package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_85 {
    private final Production94_85 production = new Production94_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}