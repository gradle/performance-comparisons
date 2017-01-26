package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_214 {
    private final Production78_214 production = new Production78_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}