package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_91 {
    private final Production78_91 production = new Production78_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}