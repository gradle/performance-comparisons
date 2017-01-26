package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_66 {
    private final Production78_66 production = new Production78_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}